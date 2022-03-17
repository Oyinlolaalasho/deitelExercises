package tddDeitelExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
//    given
    public void powerIsOffTest() {
        Television lg = new Television();
//    when
        lg.power("off");
        Boolean isOn = lg.isOn();
//    assert
        int number = 5;
        assertEquals(false, isOn);
    }


    @Test
    public void switchTest(){
        Television lg = new Television();
        lg.switcher();
        Boolean status = lg.status();
        assertEquals(true, status);
    }

    @Test
    // given
    public void powerIsOnTest() {
        Television lg = new Television();
//    when
        lg.power("on");
        Boolean isOn = lg.isOn();
//    assert
        assertEquals(true, isOn);
    }

    @Test
    //given
    public void increaseVolumeTest() {
        Television lg = new Television();
//    when
        lg.volumeUp();
        lg.volumeUp();
        int volume = lg.volume();
//        assert
        assertEquals(2, volume);
    }

    @Test
    //given
    public void decreaseVolumeTest() {
        Television lg = new Television();
//    when
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
//  when
        lg.volumeDown();
        lg.volumeDown();
        int volume = lg.volume();
//        assert
        assertEquals(18, volume);
    }

    @Test
    //given
    public void increaseVolumeBeyond20Test() {
        Television lg = new Television();
//    when
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
//  when
        lg.volumeUp();
        int volume = lg.volume();
//  assert
        assertEquals(20, volume);
    }

    @Test
    //given
    public void decreaseVolumeBeyond0Test() {
        Television lg = new Television();
//    when
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
//  when
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        lg.volumeDown();
        //when
        lg.volumeDown();
        int volume = lg.volume();
        //assert
        assertEquals(0, volume);
    }
//channel set to 20 and 1
//channel limit below 1 and 20
//mute = 0

    @Test
    //given
    public void increaseChannelTest() {
        Television lg = new Television();
//  when
        lg.increaseChannel();
        int channel = lg.channel();
//        assert
        assertEquals(2, channel);
    }

    @Test
    //given
    public void decreaseChannelTest() {
        Television lg = new Television();
        //  when
        lg.increaseChannel();
        lg.increaseChannel();
        //  when
        lg.decreaseChannel();
        int channel = lg.channel();
        //        assert
        assertEquals(2, channel);

    }

    @Test
    //given
    public void increaseChannelBeyond20Test() {
        Television lg = new Television();
//    when
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
//        when
        lg.increaseChannel();
        int channel = lg.channel();
        assertEquals(20, channel);
    }

    @Test
    //given
    public void decreaseChannelBeyond1Test() {
        Television lg = new Television();
//    when
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
//    when
        lg.decreaseChannel();
        lg.decreaseChannel();
        lg.decreaseChannel();
        lg.decreaseChannel();
        lg.decreaseChannel();
        int channel = lg.channel();
        assertEquals(1, channel);
    }

    @Test
    //given
    public void inputChannelTest() {
        Television lg = new Television();
        //when
        lg.inputChannel(16);
        int channel = lg.channel();
        //assert
        assertEquals(16, channel);
    }

    @Test
    //given
    public void inputChannelLimitTest() {
        Television lg = new Television();
        //when
        lg.inputChannel(0);
        int channel = lg.channel();
        //assert
        assertEquals(1, channel);
    }
    @Test
    //given
    public void muteVolumeTest(){
        Television lg = new Television();
    //when
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
        lg.increaseChannel();
    //when
        lg.muteVolume();
        int volume = lg.volume();
    //assert
        assertEquals(0, volume);

    }
    @Test
    //given
    public void unmuteVolumeTest(){
        Television lg = new Television();
        //when
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.muteVolume();
        //when
        lg.unmuteVolume();
        int volume = lg.volume();
        //assert
        assertEquals(4,volume);
    }

    @Test
    //given
    public void increaseMuteIncreaseTest(){
        Television lg =  new Television();
        //when
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.muteVolume();
        //when
        lg.volumeUp();
        int volume = lg.volume();
        //assert
        assertEquals(5, volume);
    }

    @Test
    //given
    public void decreaseMuteDecreaseTest(){
        Television lg = new Television();
    //when
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeUp();
        lg.volumeDown();
        lg.volumeDown();
        lg.muteVolume();
    //when
        lg.volumeDown();
        int volume = lg.volume();
    //assert
        assertEquals(1  , volume);
    }

    @Test
    //given
    public void muteToggleTest(){
        Television lg = new Television();
        int num = 1;
        while (num <= 4) {
            lg.volumeUp();
            num = num + 1;
        }
//        lg.muteToggle();
        assertTrue(lg.muteToggle());
        assertFalse(lg.muteToggle());
//        lg.muteToggle();
        //when
        lg.volumeUp();
        assertEquals(5, lg.volume());
    }
}
