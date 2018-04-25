package br.com.lab510.models;

public class Request {

	private TransactionEvent transactionEvent;

	public TransactionEvent getTransactionEvent() {
		return transactionEvent;
	}

	public void setTransactionEvent(TransactionEvent transactionEvent) {
		this.transactionEvent = transactionEvent;
	}
	
	@Override
	public String toString() {
		
		return "<br>transactionStatus: " + this.transactionEvent.getTransactionStatus() +
				"<br>transactionType: " + this.transactionEvent.getTransactionType() +
				"<br>transactionID: " + this.transactionEvent.getTransactionID() +
				"<br>tid: " + this.transactionEvent.getTid() +
				"<br>orderID: " + this.transactionEvent.getOrderID() +
				"<br>transactionState: " + this.transactionEvent.getTransactionState() +
				"<br>transactionDate: " + this.transactionEvent.getTransactionDate() +
				"<br>nsu: " + this.transactionEvent.getNsu() +
				"<br>merchantId: " + this.transactionEvent.getMerchantId() +
				"<br>transactionAmount: " + this.transactionEvent.getTransactionAmount();
	}

}
