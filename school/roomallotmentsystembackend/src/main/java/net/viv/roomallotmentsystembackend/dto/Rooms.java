package net.viv.roomallotmentsystembackend.dto;

public class Rooms {

	private int roomId;
	private String roomName;
	private int placeId;
	private String PlaceName;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return PlaceName;
	}

	public void setPlaceName(String placeName) {
		PlaceName = placeName;
	}

}
