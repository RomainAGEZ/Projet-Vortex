package Projet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Searcher searcher = new IndexSearcher("./webindex/");
		StandardAnalyzer analyzer = new StandardAnalyzer();
		Query query = QueryParser.parse(searchQuery, "contentKeywords", analyzer); 
		Hits hits = searcher.search(query);

	}
	
	

}
