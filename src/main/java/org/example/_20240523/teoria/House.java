package org.example._20240523.teoria;

    public class House {
        private int floor;
        private int rooms;
        private String address;

        public House() {}

        public House(int floor, int rooms, String address) {
            this.floor = floor;
            this.rooms = rooms;
            this.address = address;
        }

        public int getFloor() {
            return this.floor;
        }

        public int getRooms() {
            return this.rooms;
        }

        public String getAddress() {
            return this.address;
        }

        public void setFloor(int floor) {
            this.floor = floor;
        }

        public void setRooms(int rooms) {
            this.rooms = rooms;
        }

        public void setAddress(String address) {
            this.address = address;
        }

    }