#include <stdio.h>

int main() {
 int rows; 
int cols; 
int season_length; 
season_length = 7; 
int years; 
double avgScore[rows][1];
for(int row = 0; row < rows; row++) {
 for(int irrelevant = 0; irrelevant < 1; irrelevant++) {
  avgScore[row][irrelevant] = ({double pt[years][season_length];
for(int i = 0; i < years; i++) {
 for(int j = 0; j < season_length; j++) {
  pt[i][j] = ({int k; 
k = ((i * season_length) + j); 
(( !(k < cols)) ? (0.0 - 25) : data[row][k]);});
 }
}
double comparisonMatrix[years][years];
for(int i = 0; i < years; i++) {
 for(int j = 0; j < years; j++) {
  comparisonMatrix[i][j] = (( !(( !(j < i)) && ( !(j == i)))) ? 0.0 : ({double diff; 
diff = 0; 
int k; 
k = 0; 
while ( ( !(( !(k < (season_length - 1))) && ( !(k == (season_length - 1))))) )
{
{
diff = ((diff + pt[i][k]) - pt[j][k]); 
}
k = (k + 1); 
}
(diff / season_length);}));
 }
}
double modelAvgScore[years][1];
for(int yr = 0; yr < years; yr++) {
 for(int dontcare = 0; dontcare < 1; dontcare++) {
  modelAvgScore[yr][dontcare] = ({int x; 
int y; 
double score1; 
score1 = 0.0; 
x = 0; 
while ( ( !(( !(x < yr)) && ( !(x == yr)))) )
{
{
y = (yr + 1); 
while ( ( !(( !(y < (years - 1))) && ( !(y == (years - 1))))) )
{
{
score1 = (score1 + comparisonMatrix[x][y]); 
}
y = (y + 1); 
}
}
x = (x + 1); 
}
score1 = ((score1 * 2) / (yr * (years - yr))); 
double score2; 
score2 = 0.0; 
x = 0; 
while ( ( !(( !(x < yr)) && ( !(x == yr)))) )
{
{
y = 0; 
while ( ( !(( !(y < yr)) && ( !(y == yr)))) )
{
{
score2 = (score2 + comparisonMatrix[x][y]); 
}
y = (y + 1); 
}
}
x = (x + 1); 
}
score2 = (score2 / (((yr - 1) * yr) / 2)); 
double score3; 
score3 = 0.0; 
x = (yr + 1); 
while ( ( !(( !(x < (years - 1))) && ( !(x == (years - 1))))) )
{
{
y = (yr + 1); 
while ( ( !(( !(y < (years - 1))) && ( !(y == (years - 1))))) )
{
{
score3 = (score3 + comparisonMatrix[x][y]); 
}
y = (y + 1); 
}
}
x = (x + 1); 
}
score3 = (score3 / (((years - yr) * ((years - yr) - 1)) / 2)); 
((score1 - score2) - score3);});
 }
}
double maximum; 
maximum = (0.0 - 25); 
int k; 
k = 0; 
k = 0; 
while ( ( !(( !(k < (years - 1))) && ( !(k == (years - 1))))) )
{
{
if ( ( !( !(( !(modelAvgScore[k][0] < maximum)) && ( !(modelAvgScore[k][0] == maximum))))) )
{
maximum = modelAvgScore[k][0]; 
}
}
k = (k + 1); 
}
maximum;});
 }
}
int j; 
j = 0; 
while ( ( !(( !(j < (rows - 1))) && ( !(j == (rows - 1))))) )
{
{
printf ("%f", avgScore[j][0]); 
printf ("%s", "\n"); 
}
j = (j + 1); 
}
}

