/*
 * CreateChatCompletionRequest_stop.h
 *
 * Up to 4 sequences where the API will stop generating further tokens. 
 */

#ifndef _CreateChatCompletionRequest_stop_H_
#define _CreateChatCompletionRequest_stop_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Up to 4 sequences where the API will stop generating further tokens. 
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionRequest_stop : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatCompletionRequest_stop();
	CreateChatCompletionRequest_stop(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatCompletionRequest_stop();

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

#endif /* _CreateChatCompletionRequest_stop_H_ */
