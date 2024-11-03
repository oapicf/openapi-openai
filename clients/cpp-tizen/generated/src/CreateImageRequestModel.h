/*
 * CreateImageRequest_model.h
 *
 * The model to use for image generation.
 */

#ifndef _CreateImageRequest_model_H_
#define _CreateImageRequest_model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The model to use for image generation.
 *
 *  \ingroup Models
 *
 */

class CreateImageRequest_model : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateImageRequest_model();
	CreateImageRequest_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateImageRequest_model();

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

#endif /* _CreateImageRequest_model_H_ */
