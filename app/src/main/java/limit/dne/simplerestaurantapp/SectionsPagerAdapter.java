package limit.dne.simplerestaurantapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new PizzaListFragment();
            case 2:
                return new PastaListFragment();
            case 3:
                return new StoreListFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Home";
            case 1:
                return "Pizzas";
            case 2:
                return "Pastas";
            case 3:
                return "Locations";
        }
        return null;
    }
}
