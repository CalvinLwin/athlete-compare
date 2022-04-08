/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.webscraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** This is the file for the web scraping algorithm that will scrape info from the athlete database.
 *  This uses the JSoup HTML Parser
 *
 * @author Calvin Lwin, Yashika Chidirala
 */
public class WebScraper {
    private final String url = "https://www.worldathletics.org/athletes";
    
    
    public static void main(String[] args) {
        String athlete_info = getInfo();
    }
    
    public String getInfo(){
        Document info;
        try{
            info = Jsoup.connect(url);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
