public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

	public RecyclerViewAdapter(List<Category> categoryList) {

	}

	@Override
	public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new RecyclerViewHolder(LayoutInflater.from(parent.getContext()))
			.inflate(R.layout.recycler_item, parent, false);
	}
}