/*
 * CreateImageEditRequest_model.h
 *
 * The model to use for image generation. Only &#x60;dall-e-2&#x60; is supported at this time.
 */

#ifndef _CreateImageEditRequest_model_H_
#define _CreateImageEditRequest_model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The model to use for image generation. Only `dall-e-2` is supported at this time.
 *
 *  \ingroup Models
 *
 */

class CreateImageEditRequest_model : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateImageEditRequest_model();
	CreateImageEditRequest_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateImageEditRequest_model();

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

#endif /* _CreateImageEditRequest_model_H_ */
