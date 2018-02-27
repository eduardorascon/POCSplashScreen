public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

	private List<Category> categoryList;

	public RecyclerViewAdapter(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

	@Override
	public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new RecyclerViewHolder(LayoutInflater.from(parent.getContext()))
			.inflate(R.layout.recycler_item, parent, false);
	}

	@Override
	public int getItemCount() {
		return 0;
	}
}