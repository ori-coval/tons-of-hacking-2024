package ori.coval.hackton2024;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class SharedFilesAdapter extends RecyclerView.Adapter<SharedFilesAdapter.SharedFileViewHolder> {

    private List<String> questions;

    public SharedFilesAdapter(List<String> questains) {
        this.questions = questains;
    }

    @NonNull
    @Override
    public SharedFileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sign_up_q, parent, false);
        return new SharedFileViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SharedFileViewHolder holder, int position) {
        String question = questions.get(position);
        holder.textFileName.setText(question);

    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    public class SharedFileViewHolder extends RecyclerView.ViewHolder {
        public TextView textFileName;
        public EditText editText;

        public SharedFileViewHolder(View itemView) {
            super(itemView);
            textFileName = itemView.findViewById(R.id.textView2);
            editText = itemView.findViewById(R.id.edit_query);
        }
    }
}

