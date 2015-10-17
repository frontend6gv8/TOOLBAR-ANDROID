#Como criar um toolbar com material design

Links sobre Toolbar

 - https://materialdesignicons.com/
 - http://romannurik.github.io/AndroidAssetStudio/nine-patches.html
 - http://www.materialpalette.com/
 - http://www.google.com/design/spec/layout/structure.html#structure-toolbars

Step`s for create toolbar

1 - Se a versao do seu android studio for maior que v1.1, não é necessario implementar o suporte ao toolbar no Grandle:

    dependencies {
        ...
        compile "com.android.support:appcompat-v7:21.0.+"
    }

2 - Adicionar os seguintes itens do style.xml da sua aplicação:


    <style name="Theme.MyTheme" parent="Theme.AppCompat.NoActionBar">
        <!-- colorPrimary is used for the default action bar background -->
        <item name="colorPrimary">@color/my_awesome_color</item>

        <!-- colorPrimaryDark is used for the status bar -->
        <item name="colorPrimaryDark">@color/my_awesome_darker_color</item>

        <!-- colorAccent is used as the default value for colorControlActivated, which is used to tint widgets -->
        <item name="colorAccent">@color/accent</item>
    </style>

 - 2.1) Note que o style parent do nosso style "MyTheme", desabilita a action Bar.

 - 2.2) Alterar o thema da app no AndroidManisfest.xml

3 - Adicionar ao meu layout.xml a view Toolbar:

..
    <android.support.v7.widget.Toolbar
        android:id="@+id/my_toolbar"
        android:layout_height="?attr/actionBarSize"
        android:layout_width="match_parent"
        android:minHeight="?attr/actionBarSize"
        android:background="?attr/colorPrimary"
    />

4 - Setar o toolbar na activity, para isso basta pega uma referencia ao nosso toolbar e adiciona-lo em nossa activity:

    private Toolbar myToolbar;

    protected void onCreate(){

        myToolbar = (Toolbar) findViewById("myToolbar");
        myToolbar.setTitle("Titulo do Toolbar");
        myToolbar.setSubtitle("SubTitle");
        myToolbar.setLog(R.drawable.ic_launcher);

        setSupportActionBar(myToolbar);
    }
