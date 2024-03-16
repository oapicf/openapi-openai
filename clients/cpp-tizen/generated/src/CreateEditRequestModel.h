/*
 * CreateEditRequest_model.h
 *
 * ID of the model to use. You can use the &#x60;text-davinci-edit-001&#x60; or &#x60;code-davinci-edit-001&#x60; model with this endpoint.
 */

#ifndef _CreateEditRequest_model_H_
#define _CreateEditRequest_model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief ID of the model to use. You can use the `text-davinci-edit-001` or `code-davinci-edit-001` model with this endpoint.
 *
 *  \ingroup Models
 *
 */

class CreateEditRequest_model : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateEditRequest_model();
	CreateEditRequest_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateEditRequest_model();

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

#endif /* _CreateEditRequest_model_H_ */
