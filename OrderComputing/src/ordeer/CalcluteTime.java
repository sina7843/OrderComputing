/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordeer;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class CalcluteTime {
    
    static String points="";
    public static StringBuilder request()
    {
        StringBuilder response = null;
        HttpURLConnection connection = null;
            String urlParameters="";
            try {
                urlParameters = "tool=" + URLEncoder.encode("lagrange-interpolating-polynomial", "UTF-8") +
                        "&points=" + URLEncoder.encode(points, "UTF-8");
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(CalcluteTime.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                //Create connection
                URL url = new URL("https://www.dcode.fr/api/");
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
                
                connection.setRequestProperty("Content-Language", "en-US");
                
                connection.setUseCaches(false);
                connection.setDoOutput(true);
                
                //Send request
                DataOutputStream wr = new DataOutputStream (
                        connection.getOutputStream());
                wr.writeBytes(urlParameters);
                wr.close();
                
                //Get Response
                InputStream is = connection.getInputStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(is));
                response = new StringBuilder();
                String line;
                
                while ((line = rd.readLine()) != null) {
                    response.append(line);
                    response.append('\r');
                }
                rd.close();
                
            } catch (Exception e) {
            } finally {
                if (connection != null) {
                    connection.disconnect();
                }
            }
        return response;
    }
}   
    

