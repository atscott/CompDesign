package lab2;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Runner {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		GpsSubject subject  = new GpsSubject();
        Delta delta = new Delta(subject);
        //TODO: Add new Altimeter and Direction
        // need to modify the constructors in those classes to accept a Subject

        for(GPSCoordinate coordinate : loadGPSFile()){
            subject.setCoordinates(coordinate);
        }

	}

    private static ArrayList<GPSCoordinate> loadGPSFile(){
        ArrayList<GPSCoordinate> coordinates = new ArrayList<GPSCoordinate>();

        //coordinate sets are separated by spaces
        String[] coordinateSets = getFileAsString().split(" ");

        for(String coordinateSet : coordinateSets){
            //xyz values are separated by commas
            String[] xyz = coordinateSet.split(",");
            //if you don't have xyz, then bad coordinate set
            if(xyz.length == 3){
                coordinates.add(new GPSCoordinate(Double.parseDouble(xyz[0]), Double.parseDouble(xyz[1]), Double.parseDouble(xyz[2])));
            }   else{
                System.out.println("Invalid coordinate set: " + coordinateSet);
            }
        }

        return coordinates;
    }

    private static String getFileAsString(){
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader br= Files.newBufferedReader(Paths.get("lab2/GpsData.txt"), Charset.defaultCharset());

            String line;
            while((line = br.readLine()) != null){
                sb.append(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return sb.toString();
    }
}