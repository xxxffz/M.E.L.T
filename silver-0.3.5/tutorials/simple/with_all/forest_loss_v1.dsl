main() {

  Integer rows;

  Integer cols;

  
  Integer season_length;
  season_length = 7;
  
  Integer years;


  Matrix avgScore[rows, 1] row, irrelevant =
    let
      Matrix pt[years, season_length] i,j =
        let
          Integer k;
          k = i*season_length + j;
        in
          if k >= cols
          then 0.0-25
          else data[row, k]
        end;

      Matrix comparisonMatrix[years, years] i,j =
        if j <= i then 0.0
        else
          let
            Float diff;
            diff = 0;
            Integer k;
            for(k = 0 to season_length-1) {
              diff = diff + pt[i,k] - pt[j,k];
            }
          in
            diff / season_length
          end;

  
      Matrix modelAvgScore[years, 1] yr, dontcare =
        let
          Integer x;
          Integer y;
         
          Float score1;
          score1 = 0.0;
          for(x = 0 to yr) {
            for(y = yr+1 to years-1) {
              score1 = score1 + comparisonMatrix[x,y];
            }
          }
          score1 = score1 * 2 / (yr * (years - yr));
         
          Float score2;
          score2 = 0.0;
          for(x = 0 to yr) {
            for(y = 0 to yr) {
              score2 = score2 + comparisonMatrix[x,y];
            }
          }
          score2 = score2 / ((yr-1) * yr / 2);
         
          Float score3;
          score3 = 0.0;
          for(x = yr+1 to years-1) {
            for(y = yr+1 to years-1) {
              score3 = score3 + comparisonMatrix[x,y];
            }
          }
          score3 = score3 / ((years-yr)*(years-yr-1)/2);
        in
          score1 - score2 - score3
        end;

       
      Float maximum;
      maximum = 0.0-25;
      Integer k;
      k = 0;
      for(k = 0 to years-1) {
        if(modelAvgScore[k,0] > maximum) {
           maximum = modelAvgScore[k,0] ;
        }
      }

    in
      maximum
    end;
  
  Integer j;
  for(j = 0 to rows-1) {
    print(avgScore[j,0]);
    print("\n");
  }

}
