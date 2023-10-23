class custom_Compare{
    
    // Compare function
    static void sortPairs(Pair arr[], int N){
        
        // Your code here
        
        //printing the x,y Pairs
        for(int i = 0;i < N;i++)
        {
            for(int j = i+1;j < N;j++)
            {
                if(arr[i].x > arr[j].x)
                {
                    int temp = arr[i].x;
                    int temp1 = arr[i].y;
                    arr[i].x = arr[j].x;
                    arr[i].y = arr[j].y;
                    arr[j].x = temp;
                    arr[j].y = temp1;
                }
            }
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}


//Orrrr---> Use custom Comparator or Lambda expressions Approach
Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
              return p1.x - p2.x;
            }
        });
        
        //printing the x,y Pairs
        for(int i = 0;i<N;i++){
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}
