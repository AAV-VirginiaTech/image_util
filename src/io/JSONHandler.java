package io;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JSONHandler {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		
		int user_orientation = 10;
		int user_shape = 20;
		int user_backColor = 40;
		int user_alphanumeric = 0;
		int user_alphaColor = 50;
		
		String orientation = "hi";
		String shape = " ";
		String alphanumeric = " ";
		String backColor = " ";
		String alphaColor = " ";
		
		if (user_orientation == 10)	{
			orientation = "North";
		}
		else if (user_orientation == 11) {
			orientation = "North-East";
		}
		else if (user_orientation == 12) {
			orientation = "East";
		}
		else if (user_orientation == 13) {
			orientation = "South-East";
		}
		else if (user_orientation == 14) {
			orientation = "South";
		}
		else if (user_orientation == 15) {
			orientation = "South-West";
		}
		else if (user_orientation == 16) {
			orientation = "West";
		}
		else if (user_orientation == 17) {
			orientation = "North-West";
		}
		
	
		if (user_shape == 20) {
			shape = "circle";
		}
		else if (user_shape == 21) {
			shape = "semicircle";
		}
		else if (user_shape == 22) {
			shape = "quarter-circle";
		}
		else if (user_shape == 23) {
			shape = "triangle";
		}
		else if (user_shape == 24) {
			shape = "square";
		}
		else if (user_shape == 25) {
			shape = "rectangle";
		}
		else if (user_shape == 26) {
			shape = "trapazoid";
		}
		else if (user_shape == 27) {
			shape = "pentagon";
		}
		else if (user_shape == 28) {
			shape = "hexagon";
		}
		else if (user_shape == 29) {
			shape = "heptagon";
		}
		else if (user_shape == 30) {
			shape = "octogon";
		}
		else if (user_shape == 31) {
			shape = "star";
		}
		else if (user_shape == 32) {
			shape = "cross";
		}
		
		
		if (user_backColor == 40) {
			backColor = "white";
		}
		else if (user_backColor == 41) {
			backColor = "black";
		}
		else if (user_backColor == 42) {
			backColor = "gray";
		}
		else if (user_backColor == 43) {
			backColor = "red";
		}
		else if (user_backColor == 44) {
			backColor = "blue";
		}
		else if (user_backColor == 45) {
			backColor = "green";
		}
		else if (user_backColor == 46) {
			backColor = "yellow";
		}
		else if (user_backColor == 47) {
			backColor = "purple";
		}
		else if (user_backColor == 48) {
			backColor = "brown";
		}
		else if (user_backColor == 49) {
			backColor = "orange";
		}
		
		if (user_alphanumeric == 0) {
			alphanumeric = "0";
		}
		else if (user_alphanumeric == 1) {
			alphanumeric = "1";
		}
		else if (user_alphanumeric == 2) {
			alphanumeric = "2";
		}
		else if (user_alphanumeric == 3) {
			alphanumeric = "3";
		}
		else if (user_alphanumeric == 4) {
			alphanumeric = "4";
		}
		else if (user_alphanumeric == 5) {
			alphanumeric = "5";
		}
		else if (user_alphanumeric == 6) {
			alphanumeric = "6";
		}
		else if (user_alphanumeric == 7) {
			alphanumeric = "7";
		}
		else if (user_alphanumeric == 8) {
			alphanumeric = "8";
		}
		else if (user_alphanumeric == 9) {
			alphanumeric = "9";
		}
		else if (user_alphanumeric == 'a') {
			alphanumeric = "a";
		}
		else if (user_alphanumeric == 'b') {
			alphanumeric = "b";
		}
		else if (user_alphanumeric == 'c') {
			alphanumeric = "c";
		}
		else if (user_alphanumeric == 'd') {
			alphanumeric = "d";
		}
		else if (user_alphanumeric == 'e') {
			alphanumeric = "e";
		}
		else if (user_alphanumeric == 'f') {
			alphanumeric = "f";
		}
		else if (user_alphanumeric == 'g') {
			alphanumeric = "g";
		}
		else if (user_alphanumeric == 'h') {
			alphanumeric = "h";
		}
		else if (user_alphanumeric == 'i') {
			alphanumeric = "i";
		}
		else if (user_alphanumeric == 'j') {
			alphanumeric = "j";
		}
		else if (user_alphanumeric == 'k') {
			alphanumeric = "k";
		}
		else if (user_alphanumeric == 'l') {
			alphanumeric = "l";
		}
		else if (user_alphanumeric == 'm') {
			alphanumeric = "m";
		}
		else if (user_alphanumeric == 'n') {
			alphanumeric = "n";
		}
		else if (user_alphanumeric == 'o') {
			alphanumeric = "o";
		}
		else if (user_alphanumeric == 'p') {
			alphanumeric = "p";
		}
		else if (user_alphanumeric == 'q') {
			alphanumeric = "q";
		}
		else if (user_alphanumeric == 'r') {
			alphanumeric = "r";
		}
		else if (user_alphanumeric == 's') {
			alphanumeric = "s";
		}		
		else if (user_alphanumeric == 't') {
			alphanumeric = "t";
		}
		else if (user_alphanumeric == 'u') {
			alphanumeric = "u";
		}
		else if (user_alphanumeric == 'v') {
			alphanumeric = "v";
		}
		else if (user_alphanumeric == 'w') {
			alphanumeric = "w";
		}
		else if (user_alphanumeric == 'x') {
			alphanumeric = "x";
		}
		else if (user_alphanumeric == 'y') {
			alphanumeric = "y";
		}
		else if (user_alphanumeric == 'z') {
			alphanumeric = "z";
		}
		else if (user_alphanumeric == 'A') {
			alphanumeric = "A";
		}
		else if (user_alphanumeric == 'B') {
			alphanumeric = "B";
		}
		else if (user_alphanumeric == 'C') {
			alphanumeric = "C";
		}
		else if (user_alphanumeric == 'D') {
			alphanumeric = "D";
		}
		else if (user_alphanumeric == 'E') {
			alphanumeric = "E";
		}
		else if (user_alphanumeric == 'F') {
			alphanumeric = "F";
		}
		else if (user_alphanumeric == 'G') {
			alphanumeric = "G";
		}
		else if (user_alphanumeric == 'H') {
			alphanumeric = "H";
		}
		else if (user_alphanumeric == 'I') {
			alphanumeric = "I";
		}
		else if (user_alphanumeric == 'J') {
			alphanumeric = "J";
		}
		else if (user_alphanumeric == 'K') {
			alphanumeric = "K";
		}
		else if (user_alphanumeric == 'L') {
			alphanumeric = "L";
		}
		else if (user_alphanumeric == 'M') {
			alphanumeric = "M";
		}
		else if (user_alphanumeric == 'N') {
			alphanumeric = "N";
		}
		else if (user_alphanumeric == 'O') {
			alphanumeric = "O";
		}
		else if (user_alphanumeric == 'P') {
			alphanumeric = "P";
		}
		else if (user_alphanumeric == 'Q') {
			alphanumeric = "Q";
		}
		else if (user_alphanumeric == 'R') {
			alphanumeric = "R";
		}
		else if (user_alphanumeric == 'S') {
			alphanumeric = "S";
		}		
		else if (user_alphanumeric == 'T') {
			alphanumeric = "T";
		}
		else if (user_alphanumeric == 'U') {
			alphanumeric = "U";
		}
		else if (user_alphanumeric == 'V') {
			alphanumeric = "V";
		}
		else if (user_alphanumeric == 'W') {
			alphanumeric = "W";
		}
		else if (user_alphanumeric == 'X') {
			alphanumeric = "X";
		}
		else if (user_alphanumeric == 'Y') {
			alphanumeric = "Y";
		}
		else if (user_alphanumeric == 'Z') {
			alphanumeric = "Z";
		}
		
		if (user_alphaColor == 50) {
			alphaColor = "white";
		}
		else if (user_alphaColor == 51) {
			alphaColor = "black";
		}
		else if (user_alphaColor == 52) {
			alphaColor = "gray";
		}
		else if (user_alphaColor == 53) {
			alphaColor = "red";
		}
		else if (user_alphaColor == 54) {
			alphaColor = "blue";
		}
		else if (user_alphaColor == 55) {
			alphaColor = "green";
		}
		else if (user_alphaColor == 56) {
			alphaColor = "yellow";
		}
		else if (user_alphaColor == 57) {
			alphaColor = "purple";
		}
		else if (user_alphaColor == 58) {
			alphaColor = "brown";
		}
		else if (user_alphaColor == 59) {
			alphaColor = "orange";
		}
		
		
		obj.put("name", "Billy bob");
		obj.put("location","USA");
		JSONArray list = new JSONArray();
		list.put("Java");
		list.put("JSP");
		list.put("Servlets");
		obj.put("courses", list);
		
		try(FileWriter file = new FileWriter("myJson.json"))
		{
			file.write(obj.toString());
			file.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(obj);
		

	}

}
