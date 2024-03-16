/*
 * CreateEmbeddingRequest_model.h
 *
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
 */

#ifndef _CreateEmbeddingRequest_model_H_
#define _CreateEmbeddingRequest_model_H_


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

class CreateEmbeddingRequest_model : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateEmbeddingRequest_model();
	CreateEmbeddingRequest_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateEmbeddingRequest_model();

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

#endif /* _CreateEmbeddingRequest_model_H_ */
