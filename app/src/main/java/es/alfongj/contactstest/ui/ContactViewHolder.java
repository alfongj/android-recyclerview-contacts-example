package es.alfongj.contactstest.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import es.alfongj.contactstest.R;
import es.alfongj.contactstest.framework.widgets.RoundedImageView;
import es.alfongj.contactstest.model.Contact;

/**
 * Contains a Contact List Item
 */
public class ContactViewHolder extends RecyclerView.ViewHolder {
    private RoundedImageView mImage;
    private TextView mLabel;
    private Contact mBoundContact; // Can be null

    public ContactViewHolder(final View itemView) {
        super(itemView);
        mImage = (RoundedImageView) itemView.findViewById(R.id.rounded_iv_profile);
        mLabel = (TextView) itemView.findViewById(R.id.tv_label);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mBoundContact != null) {
                    Toast.makeText(
                            itemView.getContext(),
                            "Hi, I'm " + mBoundContact.name,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void bind(Contact contact) {
        mBoundContact = contact;
        mLabel.setText(contact.name);
        Picasso.with(itemView.getContext())
                .load(contact.profilePic)
                .placeholder(R.drawable.ic_launcher)
                .error(R.drawable.ic_launcher)
                .into(mImage);
    }
}
