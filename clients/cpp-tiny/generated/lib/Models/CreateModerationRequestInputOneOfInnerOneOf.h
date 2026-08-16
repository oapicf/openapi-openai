
/*
 * CreateModerationRequest_input_oneOf_inner_oneOf.h
 *
 * An object describing an image to classify.
 */

#ifndef TINY_CPP_CLIENT_CreateModerationRequest_input_oneOf_inner_oneOf_H_
#define TINY_CPP_CLIENT_CreateModerationRequest_input_oneOf_inner_oneOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateModerationRequest_input_oneOf_inner_oneOf_image_url.h"

namespace Tiny {


/*! \brief An object describing an image to classify.
 *
 *  \ingroup Models
 *
 */

class CreateModerationRequest_input_oneOf_inner_oneOf{
public:

    /*! \brief Constructor.
	 */
    CreateModerationRequest_input_oneOf_inner_oneOf();
    CreateModerationRequest_input_oneOf_inner_oneOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateModerationRequest_input_oneOf_inner_oneOf();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string type{};
    CreateModerationRequest_input_oneOf_inner_oneOf_image_url image_url;
};
}

#endif /* TINY_CPP_CLIENT_CreateModerationRequest_input_oneOf_inner_oneOf_H_ */
