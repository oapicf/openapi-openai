/*
 * CreateModerationRequest_input_oneOf_inner_oneOf.h
 *
 * An object describing an image to classify.
 */

#ifndef _CreateModerationRequest_input_oneOf_inner_oneOf_H_
#define _CreateModerationRequest_input_oneOf_inner_oneOf_H_


#include <string>
#include "CreateModerationRequest_input_oneOf_inner_oneOf_image_url.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object describing an image to classify.
 *
 *  \ingroup Models
 *
 */

class CreateModerationRequest_input_oneOf_inner_oneOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateModerationRequest_input_oneOf_inner_oneOf();
	CreateModerationRequest_input_oneOf_inner_oneOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateModerationRequest_input_oneOf_inner_oneOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always `image_url`.
	 */
	std::string getType();

	/*! \brief Set Always `image_url`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	CreateModerationRequest_input_oneOf_inner_oneOf_image_url getImageUrl();

	/*! \brief Set 
	 */
	void setImageUrl(CreateModerationRequest_input_oneOf_inner_oneOf_image_url  image_url);

private:
	std::string type;
	CreateModerationRequest_input_oneOf_inner_oneOf_image_url image_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateModerationRequest_input_oneOf_inner_oneOf_H_ */
