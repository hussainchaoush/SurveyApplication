package com.example.demo.bao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Attended;
import com.example.demo.dto.NotAttended;


@Service
public class StoreData {

	private static Integer UID=101;
	private static Set<String> ipAddressSet=new HashSet<String>();
	private static Map<Integer, Attended> attendedMap=new HashMap<Integer,Attended>();
	private static Map<Integer, NotAttended> notAttendedMap=new HashMap<>();
	
	public void AddAttendedData(Attended attended) {
		 attendedMap.put(UID,attended);
		 UID++;
	}
	public void AddNotAttendedData(NotAttended notAttended) {
		 notAttendedMap.put(UID,notAttended);
		 UID++;
	}
	public static Integer getUID() {
		return UID;
	}
	public static void setUID(Integer uID) {
		UID = uID;
	}
	public static Map<Integer, Attended> getAttendedMap() {
		return attendedMap;
	}
	public static void setAttendedMap(Map<Integer, Attended> attendedMap) {
		StoreData.attendedMap = attendedMap;
	}
	public static Map<Integer, NotAttended> getNotAttendedMap() {
		return notAttendedMap;
	}
	public static void setNotAttendedMap(HashMap<Integer, NotAttended> notAttendedMap) {
		StoreData.notAttendedMap = notAttendedMap;
	}
	public static Set<String> getIpAddressSet() {
		return ipAddressSet;
	}
	public static void setIpAddressSet(Set<String> ipAddressSet) {
		StoreData.ipAddressSet = ipAddressSet;
	}
	public static void setNotAttendedMap(Map<Integer, NotAttended> notAttendedMap) {
		StoreData.notAttendedMap = notAttendedMap;
	}
	
	
}
