public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super(); // It will a CustomStack;
    }

    public DynamicStack(int size){
        super(); // It will call CustomStack(int size);
    }



    @Override
    public boolean push(int item) {
        if(this.isFull()){
            //Double the array size;
            int[] temp = new int[data.length * 2];
            //copy all previous items in new data array.
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        //At this point we know that array is full;
        //Insert item;
        return super.push(item);
    }
}
