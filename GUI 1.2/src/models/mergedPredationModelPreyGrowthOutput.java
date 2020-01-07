package models;

public class mergedPredationModelPreyGrowthOutput {
	private OutputPredationModelPreyGrowth combinedLists;

	public mergedPredationModelPreyGrowthOutput(OutputPredationModelPreyGrowth combinedLists) {
		this.combinedLists = combinedLists;
	}

	public OutputPredationModelPreyGrowth getCombinedLists() {
		return combinedLists;
	}

	public void setCombinedLists(OutputPredationModelPreyGrowth combinedLists) {
		this.combinedLists = combinedLists;
	}

	@Override
	public String toString() {
		return "mergedPredationModelPreyGrowthOutput [combinedLists=" + combinedLists + "]";
	}

}
