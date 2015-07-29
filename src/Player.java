
public class Player {
	private String king;
	private String queen;
	private String rooks[];
	private String bishops[];
	private String knights[];
	private String pawns[];
	
	Player(char player){
		if(player == 'w'){
			king = "d1";
			queen = "e1";
			rooks = new String[2];
			rooks[0] = "a1";
			rooks[1] = "h1";
			bishops = new String[2];
			bishops[0] = "c1";
			bishops[1] = "f1";
			knights = new String[2];
			knights[0] = "b1";
			knights[1] = "g1";
			pawns = new String[8];
			pawns[0] = "a2";
			pawns[1] = "b2";
			pawns[2] = "c2";
			pawns[3] = "d2";
			pawns[4] = "e2";
			pawns[5] = "f2";
			pawns[6] = "g2";
			pawns[7] = "h2";
		}
		else{
			king = "d8";
			queen = "e8";
			rooks = new String[2];
			rooks[0] = "a8";
			rooks[1] = "h8";
			bishops = new String[2];
			bishops[0] = "c8";
			bishops[1] = "f8";
			knights = new String[2];
			knights[0] = "b8";
			knights[1] = "g8";
			pawns = new String[8];
			pawns[0] = "a7";
			pawns[1] = "b7";
			pawns[2] = "c7";
			pawns[3] = "d7";
			pawns[4] = "e7";
			pawns[5] = "f7";
			pawns[6] = "g7";
			pawns[7] = "h7";

		}
		
	}

	public String getKing() {
		return king;
	}

	public void setKing(String king) {
		this.king = king;
	}

	public String getQueen() {
		return queen;
	}

	public void setQueen(String queen) {
		this.queen = queen;
	}

	public String[] getRooks() {
		return rooks;
	}

	public void setRooks(String[] rooks) {
		this.rooks = rooks;
	}

	public String[] getBishops() {
		return bishops;
	}

	public void setBishops(String[] bishops) {
		this.bishops = bishops;
	}

	public String[] getKnights() {
		return knights;
	}

	public void setKnights(String[] knights) {
		this.knights = knights;
	}

	public String[] getPawns() {
		return pawns;
	}

	public void setPawns(String[] pawns) {
		this.pawns = pawns;
	}
	
}
