    package com.example.kelompok4sireg5a;

    import android.content.Intent;
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
            String[] alamat = getResources().getStringArray(R.array.Alamat);
            int photo = getIntent().getIntExtra("photo",0);
            Intent intent = getIntent();

            int position = getIntent().getIntExtra("position", 0);

            String[] alamatArray = getResources().getStringArray(R.array.Alamat);
            String alamatText = alamatArray[position];
            TextView tv_Alamat = findViewById(R.id.tv_Alamat);

            tv_Alamat.setText(alamatText);

            getDataUser();
            if (getSupportActionBar() != null && user != null){
                getSupportActionBar().setTitle(user.getUsername());
                getSupportActionBar().setDisplayShowHomeEnabled(true);
            }
        }

        public void getDataUser(){
            User user = getIntent().getParcelableExtra("DATA_USER");
            if (user != null){
                ImageView img_user_detail = findViewById(R.id.img_user_detail);
                TextView tv_name = findViewById(R.id.tv_name_detail);
                TextView tv_repo = findViewById(R.id.tv_repository);
                TextView tv_followers = findViewById(R.id.tv_followers);
                TextView tv_following = findViewById(R.id.tv_following);
                TextView tv_company = findViewById(R.id.tv_Email);



                img_user_detail.setImageResource(user.getAvatar());
                tv_name.setText(user.getName());
                tv_repo.setText(String.valueOf(user.getRepository()));
                tv_followers.setText(String.valueOf(user.getFollowers()));
                tv_following.setText(String.valueOf(user.getFollowing()));
                tv_company.setText(String.valueOf(user.getEmail()));
            }
        }

    }