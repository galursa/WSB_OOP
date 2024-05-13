/*
 * Puzzle
--
#name: string
#publishingCompany: string
#price: double
#numberOfPages: Integer
--
+printInfo(): void
+vat():double
 */

class Puzzle
{
	protected String name;
	protected String publishingCompany;
	protected double price;
	protected int numberOfPages;
	Puzzle(String name,String publishingCompany, double price, int numberOfPages)
	{
		this.name = name;
		this.publishingCompany =publishingCompany;
		this.price = price;
		this.numberOfPages = numberOfPages; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public void printInfo()
	{
		System.out.println("Kind of puzzle: "+name);
		System.out.println("Made by: "+publishingCompany);
		System.out.println("Price: "+ price + " zl");
		System.out.println("Number of pages: "+numberOfPages);
	}
	public double vat()
	{
		return 0.05*price;
	}
}

/*
 * Crosswords
--
#author: string
#difficulty:  string
#language: string
#numberOfCrossword: Integer
--
+printCrossWordInfo():void

 */

class Crosswords extends Puzzle
{
	protected String author;
	protected String difficulty;
	protected String language;
	protected int numberOfCrossword;
	Crosswords(String author, String difficulty, String language,int numberOfCrossword, String name,String publishingCompany, double price, int numberOfPages)
	{
		super(name, publishingCompany, price, numberOfPages);	
		this.author = author;
		this.difficulty = difficulty;
		this.language = language;
		this.numberOfCrossword = numberOfCrossword; 
	}
	public void printCrossWordInfo()
	{
		System.out.println("Author: "+author);
		System.out.println("Difficulty level: "+difficulty);
		System.out.println("Language: "+ language);
		System.out.println("It consist of: "+numberOfCrossword+" crosswords");
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getNumberOfCrossword() {
		return numberOfCrossword;
	}
	public void setNumberOfCrossword(int numberOfCrossword) {
		this.numberOfCrossword = numberOfCrossword;
	}
}

/*
 * CodeWord
--
#yearOfPublication: string
#kindOfCodeWord[]: string
#language: string
--
+printAlphabet():void
+printCodeWordInfo():void
 */

class CodeWord extends Puzzle
{
	protected String yearOfPublication;
	protected String[] kindOfCodeWord = {"Grid","Short", "Spriral"};
	protected String language;
	CodeWord(String yearOfPublication, String language, String name, String publishingCompany, double price, int numberOfPages) {
		super(name, publishingCompany, price, numberOfPages);
		this.yearOfPublication = yearOfPublication;
		this.language = language;
	}
	public void printCodeWordInfo()
	{
		System.out.println("Published in: "+ yearOfPublication);
		System.out.println("Language: "+language);
	}
	
	public void printAlphabet()
	{
		for(int i=65; i<=90; i++)
		{
			System.out.print((char)i+" ");
		}
	}
	
}

public class PuzzleShop {
	public static void main(String[] args) {
		Puzzle wordSearchPuzzle = new Puzzle("Word Search Puzzle","Puzzler", 39.99, 200);
		wordSearchPuzzle.printInfo();
		System.out.println("VAT: "+wordSearchPuzzle.vat());
		System.out.println("Checking getter for name: "+wordSearchPuzzle.getName());
		System.out.println();
		Crosswords crosswords = new Crosswords("Anna Novak", "Beginner","english", 100, "Crosswords", "Puzzler", 49.99, 130);
		crosswords.printInfo();
		crosswords.printCrossWordInfo();
		//	publishingCompany, double price, int numberOfPages) {
		CodeWord codeWord = new CodeWord("2023", "english", "code words", "Puzzler", 23.85, 123);
		codeWord.printInfo();
		codeWord.printCodeWordInfo();
		codeWord.printAlphabet();
	}
}
