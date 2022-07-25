package com.orioninnovation.tr.oiwebrtc.rtc;


import com.orioninnovation.tr.oiwebrtc.DataChannel;
import com.orioninnovation.tr.oiwebrtc.IceCandidate;
import com.orioninnovation.tr.oiwebrtc.MediaStream;
import com.orioninnovation.tr.oiwebrtc.PeerConnection;

public class PCObserver implements PeerConnection.Observer {
    @Override
    public void onSignalingChange(PeerConnection.SignalingState newState) {

    }

    @Override
    public void onIceConnectionChange(PeerConnection.IceConnectionState newState) {

    }

    @Override
    public void onIceConnectionReceivingChange(boolean receiving) {

    }

    @Override
    public void onIceGatheringChange(PeerConnection.IceGatheringState newState) {

    }

    @Override
    public void onIceCandidate(IceCandidate candidate) {

    }

    @Override
    public void onIceCandidatesRemoved(IceCandidate[] candidates) {

    }

    @Override
    public void onAddStream(MediaStream stream) {

    }

    @Override
    public void onRemoveStream(MediaStream stream) {

    }

    @Override
    public void onDataChannel(DataChannel dataChannel) {

    }

    @Override
    public void onRenegotiationNeeded() {

    }
}
