    package com.example.kelompok4sireg5a;

    import android.os.Bundle;
    import android.widget.ImageView;
    import android.widget.TextView;

    import androidx.appcompat.app.AppCompatActivity;

    public class DetailActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            User user = getIntent().getParcelableExtra("DATA_USER");
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);
            int photo = getIntent().getIntExtra("photo",0);
            getDataUser();
            if (getSupportActionBar() != null && user != null){
                getSupportActionBar().setTitle(user.getUsername());
                getSupportActionBar().setDisplayShowHomeEnabled(true);
            }
        }

        private void getDataUser(){
            User user = getIntent().getParcelableExtra("DATA_USER");
            if (user != null){
                ImageView img_user_detail = findViewById(R.id.img_user_detail);
                TextView tv_name = findViewById(R.id.tv_name_detail);
                TextView tv_Alamat = findViewById(R.id.tv_Alamat);
                TextView tv_repo = findViewById(R.id.tv_repository);
                TextView tv_followers = findViewById(R.id.tv_followers);
                TextView tv_following = findViewById(R.id.tv_following);
                TextView tv_company = findViewById(R.id.tv_Email);




                img_user_detail.setImageResource(user.getAvatar());
                tv_name.setText(user.getName());
                tv_Alamat.setText(user.getAlamat());
                tv_repo.setText(String.valueOf(user.getRepository()));
                tv_followers.setText(String.valueOf(user.getFollowers()));
                tv_following.setText(String.valueOf(user.getFollowing()));
                tv_company.setText(String.valueOf(user.getEmail()));
            }
        }

    }