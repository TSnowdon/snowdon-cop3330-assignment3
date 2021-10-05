/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Tyler Snowdon
 */

package ex43;

import tools.Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WebsiteTemplate {
    private String name;
    private String author;
    private boolean hasJavaScript;
    private boolean hasCSS;


    public WebsiteTemplate(String name, String author, boolean hasJavaScript, boolean hasCSS) {
        this.name = name;
        this.author = author;
        this.hasJavaScript = hasJavaScript;
        this.hasCSS = hasCSS;
    }

    public void build() {
        if (new File("src/main/java/ex43/website/" + name).mkdirs()) {
            Utils.output("Created src/main/java/ex43/website/%s", name);
        }
        writeIndexFile();
        if (hasJavaScript) createDirectory(String.format("src/main/java/ex43/website/%s/%s", name, "js"));
        if (hasCSS) createDirectory(String.format("src/main/java/ex43/website/%s/%s", name, "css"));
    }

    private void writeIndexFile() {
        File indexFile = new File(String.format("src/main/java/ex43/website/%s/index.html", name));
        try {
            FileWriter writer = new FileWriter(indexFile);
            writer.write("<html>\n" +
                    "\t<head>\n" +
                    "\t\t<meta author=\"" + author + "\">\n" +
                    "\t\t<title>" + name + "</title>\n" +
                    "\t</head>\n" +
                    "</html>");
            writer.close();
            Utils.output("Created src/main/java/ex43/website/%s/index.html", name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createDirectory(String file) {
        if (new File(file).mkdirs()) {
            Utils.output("Created %s/", file);
        }
    }
}
