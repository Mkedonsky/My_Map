package ru.mkedonsky

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import ru.mkedonsky.`interface`.RetrofitServices
import ru.mkedonsky.databinding.ActivityMapsBinding
import ru.mkedonsky.input.Input

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    private lateinit var mServices: RetrofitServices


    override fun onCreate(savedInstanceState: Bundle?) {
        mServices = Input.retrofitServices

        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        val moscow = LatLng(55.7522200, 37.6155600)
        mMap.addMarker(MarkerOptions().position(moscow).title("Marker in Moscow"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(moscow))

    }


}