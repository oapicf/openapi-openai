/*
 * CreateSpeechRequest_model.h
 *
 * One of the available [TTS models](/docs/models#tts): &#x60;tts-1&#x60; or &#x60;tts-1-hd&#x60; 
 */

#ifndef _CreateSpeechRequest_model_H_
#define _CreateSpeechRequest_model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief One of the available [TTS models](/docs/models#tts): `tts-1` or `tts-1-hd` 
 *
 *  \ingroup Models
 *
 */

class CreateSpeechRequest_model : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateSpeechRequest_model();
	CreateSpeechRequest_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateSpeechRequest_model();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateSpeechRequest_model_H_ */
