package br.com.wpappgenerator.views.activities;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;

import androidx.viewpager.widget.ViewPager;
import br.com.wpappgenerator.R;
import br.com.wpappgenerator.adapters.ViewPagerAdapter;
import br.com.wpappgenerator.objects.ClientWP;
import br.com.wpappgenerator.views.fragments.ErrorFragment;
import br.com.wpappgenerator.views.fragments.InboxFragment;
import br.com.wpappgenerator.views.fragments.PostListFragment;
import br.com.wpappgenerator.views.fragments.SearchFragment;
import br.com.wpappgenerator.views.fragments.UserFragment;
import br.com.wpappgenerator.views.fragments.WishListFragment;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    public static ClientWP clienteWP;

    private final int FRAGMENT_HOME     = 0;
    private final int FRAGMENT_SEARCH   = 1;
    private final int FRAGMENT_WISHLIST = 2;
    private final int FRAGMENT_INBOX    = 3;
    private final int FRAGMENT_USER     = 4;
    private final int FRAGMENT_ERROR    = 5;

    // Referenciando variáveis com o layout através da biblioteca ButterKnife
    @BindView(R.id.activity_main_bottomview) BottomNavigationView bottomViem;
    @BindView(R.id.activity_main_viewpager) ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setupViewPager();
        setupBottomView();

        clienteWP = new ClientWP();
        clienteWP.setWPHost(true);


        /*
        http = new HTTPRequest();

        httpPost = http.getPostService();


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Call<List<Post>> listProducts = httpPost.getPosts();

                listProducts.enqueue(new Callback<List<Post>>() {

                    @Override
                    public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {

                        // Parse da resposta da API
                        List<Post> postJson = response.body();

                        Log.v("responsePost", ""+postJson.size());

                        htmltext = postJson.get(0).toString();
                        //Spanned sp = Html.fromHtml(htmltext);
                        //txt.setHtml(htmltext,new HtmlHttpImageGetter(txt));



                    }

                    @Override
                    public void onFailure(Call<List<Post>> call, Throwable t) {
                        // tratar algum erro
                        Log.v("failure", ""+t.getMessage());
                    }
                });


            }
        });

        FloatingActionButton fab2 = findViewById(R.id.fab2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.getSettings().setJavaScriptEnabled(true);
                txt.setWebChromeClient(new WebChromeClient());
                txt.loadData(htmltext, "text/html; charset=UTF-8", null);
            }
        });

        */
    }

    private void setupViewPager() {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new PostListFragment());
        adapter.addFragment(new SearchFragment());
        adapter.addFragment(new WishListFragment());
        adapter.addFragment(new InboxFragment());
        adapter.addFragment(new UserFragment());
        adapter.addFragment(new ErrorFragment());

        viewPager.setAdapter(adapter);

    }

    private void setupBottomView(){

        bottomViem.setOnNavigationItemSelectedListener(
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.action_home:
                            viewPager.setCurrentItem(FRAGMENT_HOME);
                            break;
                        case R.id.action_search:
                            viewPager.setCurrentItem(FRAGMENT_SEARCH);
                            break;
                        case R.id.action_wishlist:
                            viewPager.setCurrentItem(FRAGMENT_WISHLIST);
                            break;
                        case R.id.action_inbox:
                            viewPager.setCurrentItem(FRAGMENT_INBOX);
                            break;
                        case R.id.action_user:
                            viewPager.setCurrentItem(FRAGMENT_USER);
                            break;
                    }
                    return true;
                }
            });

    }

}
