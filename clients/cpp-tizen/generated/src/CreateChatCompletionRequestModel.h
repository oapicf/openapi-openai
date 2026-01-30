/*
 * CreateChatCompletionRequest_model.h
 *
 * ID of the model to use. See the [model endpoint compatibility](/docs/models#model-endpoint-compatibility) table for details on which models work with the Chat API.
 */

#ifndef _CreateChatCompletionRequest_model_H_
#define _CreateChatCompletionRequest_model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief ID of the model to use. See the [model endpoint compatibility](/docs/models#model-endpoint-compatibility) table for details on which models work with the Chat API.
 *
 *  \ingroup Models
 *
 */

class CreateChatCompletionRequest_model : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatCompletionRequest_model();
	CreateChatCompletionRequest_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatCompletionRequest_model();

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

#endif /* _CreateChatCompletionRequest_model_H_ */
