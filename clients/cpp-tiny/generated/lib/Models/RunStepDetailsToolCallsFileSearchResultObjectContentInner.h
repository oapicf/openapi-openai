
/*
 * RunStepDetailsToolCallsFileSearchResultObject_content_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchResultObject_content_inner_H_
#define TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchResultObject_content_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsFileSearchResultObject_content_inner{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsToolCallsFileSearchResultObject_content_inner();
    RunStepDetailsToolCallsFileSearchResultObject_content_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsToolCallsFileSearchResultObject_content_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of the content.
	 */
	std::string getType();

	/*! \brief Set The type of the content.
	 */
	void setType(std::string  type);
	/*! \brief Get The text content of the file.
	 */
	std::string getText();

	/*! \brief Set The text content of the file.
	 */
	void setText(std::string  text);


    private:
    std::string type{};
    std::string text{};
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchResultObject_content_inner_H_ */
