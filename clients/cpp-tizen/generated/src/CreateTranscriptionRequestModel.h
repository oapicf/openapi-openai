/*
 * CreateTranscriptionRequest_model.h
 *
 * ID of the model to use. Only &#x60;whisper-1&#x60; is currently available. 
 */

#ifndef _CreateTranscriptionRequest_model_H_
#define _CreateTranscriptionRequest_model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief ID of the model to use. Only `whisper-1` is currently available. 
 *
 *  \ingroup Models
 *
 */

class CreateTranscriptionRequest_model : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateTranscriptionRequest_model();
	CreateTranscriptionRequest_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateTranscriptionRequest_model();

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

#endif /* _CreateTranscriptionRequest_model_H_ */
