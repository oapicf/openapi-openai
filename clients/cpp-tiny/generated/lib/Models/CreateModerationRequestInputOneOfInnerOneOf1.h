
/*
 * CreateModerationRequest_input_oneOf_inner_oneOf_1.h
 *
 * An object describing text to classify.
 */

#ifndef TINY_CPP_CLIENT_CreateModerationRequest_input_oneOf_inner_oneOf_1_H_
#define TINY_CPP_CLIENT_CreateModerationRequest_input_oneOf_inner_oneOf_1_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief An object describing text to classify.
 *
 *  \ingroup Models
 *
 */

class CreateModerationRequest_input_oneOf_inner_oneOf_1{
public:

    /*! \brief Constructor.
	 */
    CreateModerationRequest_input_oneOf_inner_oneOf_1();
    CreateModerationRequest_input_oneOf_inner_oneOf_1(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateModerationRequest_input_oneOf_inner_oneOf_1();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `text`.
	 */
	std::string getType();

	/*! \brief Set Always `text`.
	 */
	void setType(std::string  type);
	/*! \brief Get A string of text to classify.
	 */
	std::string getText();

	/*! \brief Set A string of text to classify.
	 */
	void setText(std::string  text);


    private:
    std::string type{};
    std::string text{};
};
}

#endif /* TINY_CPP_CLIENT_CreateModerationRequest_input_oneOf_inner_oneOf_1_H_ */
