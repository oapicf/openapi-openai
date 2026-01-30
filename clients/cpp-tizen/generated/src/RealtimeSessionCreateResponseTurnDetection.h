/*
 * RealtimeSessionCreateResponse_turn_detection.h
 *
 * Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 */

#ifndef _RealtimeSessionCreateResponse_turn_detection_H_
#define _RealtimeSessionCreateResponse_turn_detection_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 *
 *  \ingroup Models
 *
 */

class RealtimeSessionCreateResponse_turn_detection : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeSessionCreateResponse_turn_detection();
	RealtimeSessionCreateResponse_turn_detection(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeSessionCreateResponse_turn_detection();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Type of turn detection, only `server_vad` is currently supported. 
	 */
	std::string getType();

	/*! \brief Set Type of turn detection, only `server_vad` is currently supported. 
	 */
	void setType(std::string  type);
	/*! \brief Get Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
	 */
	long long getThreshold();

	/*! \brief Set Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
	 */
	void setThreshold(long long  threshold);
	/*! \brief Get Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
	 */
	int getPrefixPaddingMs();

	/*! \brief Set Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
	 */
	void setPrefixPaddingMs(int  prefix_padding_ms);
	/*! \brief Get Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
	 */
	int getSilenceDurationMs();

	/*! \brief Set Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
	 */
	void setSilenceDurationMs(int  silence_duration_ms);

private:
	std::string type;
	long long threshold;
	int prefix_padding_ms;
	int silence_duration_ms;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeSessionCreateResponse_turn_detection_H_ */
