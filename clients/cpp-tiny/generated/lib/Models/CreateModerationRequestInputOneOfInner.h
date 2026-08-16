
/*
 * CreateModerationRequest_input_oneOf_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateModerationRequest_input_oneOf_inner_H_
#define TINY_CPP_CLIENT_CreateModerationRequest_input_oneOf_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateModerationRequest_input_oneOf_inner_oneOf.h"
#include "CreateModerationRequest_input_oneOf_inner_oneOf_1.h"
#include "CreateModerationRequest_input_oneOf_inner_oneOf_image_url.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateModerationRequest_input_oneOf_inner{
public:

    /*! \brief Constructor.
	 */
    CreateModerationRequest_input_oneOf_inner();
    CreateModerationRequest_input_oneOf_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateModerationRequest_input_oneOf_inner();


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
	/*! \brief Get A string of text to classify.
	 */
	std::string getText();

	/*! \brief Set A string of text to classify.
	 */
	void setText(std::string  text);


    private:
    std::string type{};
    CreateModerationRequest_input_oneOf_inner_oneOf_image_url image_url;
    std::string text{};
};
}

#endif /* TINY_CPP_CLIENT_CreateModerationRequest_input_oneOf_inner_H_ */
