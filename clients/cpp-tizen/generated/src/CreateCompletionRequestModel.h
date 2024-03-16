/*
 * CreateCompletionRequest_model.h
 *
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
 */

#ifndef _CreateCompletionRequest_model_H_
#define _CreateCompletionRequest_model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
 *
 *  \ingroup Models
 *
 */

class CreateCompletionRequest_model : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateCompletionRequest_model();
	CreateCompletionRequest_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateCompletionRequest_model();

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

#endif /* _CreateCompletionRequest_model_H_ */
