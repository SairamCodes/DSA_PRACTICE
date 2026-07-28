class Solution {
    private static class Car{
        int position;
        int speed;

        Car(int position,int speed){
            this.position = position;
            this.speed = speed;
        }
    } 
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double last = 0;
        int fleet = 0;
        double time = 0;
        Car[] cars = new Car[n];
        for(int i=0;i<n;i++){
            cars[i] = new Car(position[i],speed[i]);
        }
        Arrays.sort(cars,(a,b)->Integer.compare(b.position,a.position));
        for(int i = 0;i<n;i++){
            time = (double)(target - cars[i].position)/cars[i].speed;
            if(time > last){
                fleet++;
                last = time;
            }
           

        }
        return fleet;
    }
}
