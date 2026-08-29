class Solution {
    public void setZeroes(int[][] arr) {
        int col0=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;

                    if(j!=0)
                    arr[0][j]=0;
                    else
                    col0=0;
                }
            }
        }

        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][j]!=0){
                    if(arr[0][j]==0 || arr[i][0]==0){
                        arr[i][j]=0;
                    }
                }
            }
        }

 // arr[0][0] → ROW 0
if(arr[0][0] == 0){
    for(int j=0; j<arr[0].length; j++){
        arr[0][j] = 0;
    }
}

// col0 → COLUMN 0
if(col0 == 0){
    for(int i=0; i<arr.length; i++){
        arr[i][0] = 0;
    }
}
    }
}