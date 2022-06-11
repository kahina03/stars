package star;
public class Star {

Star(int n) {
if (n < 0)
throw new Error("ERROR! try with a integer that is greater or equal to 0.");
String s = "";
if(n > 0){
// PREMIERE PARTIE
for (int i = 0; i < n; i++) {
    if (n<=1){
for (int j = 0; j < 2 * n + n - i ; j++) {
s += " ";
}}
else{ 
    for (int j = 0; j < 2 * n + n - i - 1; j++) {
s += " ";
}
}
if (n==1){
s += "*$";
}
else {
    s += "*";
}
int k = (i - 1) * 2 + 1;
for (int l = 0; l < k; l++) {
s += " ";
}

if (k > 0)
s += "*";
s += "\n";

}

// DEUXIEME PARTIE
for (int i = 0; i < n * 2 + 1; i++) {
s += "*";
}
int k = (n - 2) * 2 + 1;
if (n<=1){
for (int i = 0; i < k+2; i++) {
s += " ";
}}
else{
    for (int i = 0; i < k; i++) {
s += " ";
}
}
for (int i = 0; i < n * 2 +1; i++) {
s += "*";
}
if (n==1) {
s += "$\n";
}
else{
s += "\n";
}


// TROIXIEME PARTIE
for (int i = 0; i < n; i++) {

for (int j = 0; j < i +1; j++) {
s += " ";
}
s += "*";
if (n<=1){
for (int j = 0; j < (6*n -5) - 2 * i+2; j++) {
s += " ";
}}
else{
    for (int j = 0; j < (6*n -5) - 2 * i ; j++) {
s += " ";
}
    
}
if (n==1){
s += "*$\n";
}
else{
 s += "*\n";   
}
}


//QUATRIEME PARTIE
for (int i = n - 2 ; i >= 0; i--) {

for (int j = 0; j < i + 1; j++) {
s += " ";
}
s += "*";
for (int j = 0; j < (6*n -5) - 2 * i ; j++) {
s += " ";
}
s += "*\n";

}

//CINQUIEME PARTIE
for (int i = 0; i < n * 2 + 1; i++) {
s += "*";
}
k = (n - 2) * 2 + 1;
if (n<=1){
for (int i = 0; i < k+2; i++) {
s += " ";
}}
else{
    for (int i = 0; i < k; i++) {
s += " ";
}
    
}

for (int i = 0; i < n * 2 + 1; i++) {
s += "*";
}
if (n==1) {
s += "$\n";
}
else{
s += "\n";
}

//SIXIEME PARTIE
for (int i = n -1; i >= 0; i--) {
    if (n<=1)
    {
for (int j = 0; j < 2 * n + n - i ; j++) {
s += " ";
}}
else{
    for (int j = 0; j < 2 * n + n - i - 1; j++) {
s += " ";
}
}
if (n==1){
s += "*$";
}
else {

    s += "*";
}
k = (i - 1) * 2 + 1;
for (int l = 0; l < k; l++) {
s += " ";
}
if (k > 0)
s += "*";
s += "\n";
}

}

System.out.println(s);

}

public static void main(String[] args) {
new Star(1);

}

}
