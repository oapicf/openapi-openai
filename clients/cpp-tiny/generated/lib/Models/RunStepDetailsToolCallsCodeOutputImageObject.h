
/*
 * RunStepDetailsToolCallsCodeOutputImageObject.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsToolCallsCodeOutputImageObject_H_
#define TINY_CPP_CLIENT_RunStepDetailsToolCallsCodeOutputImageObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDetailsToolCallsCodeOutputImageObject_image.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsCodeOutputImageObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsToolCallsCodeOutputImageObject();
    RunStepDetailsToolCallsCodeOutputImageObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsToolCallsCodeOutputImageObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `image`.
	 */
	std::string getType();

	/*! \brief Set Always `image`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunStepDetailsToolCallsCodeOutputImageObject_image getImage();

	/*! \brief Set 
	 */
	void setImage(RunStepDetailsToolCallsCodeOutputImageObject_image  image);


    private:
    std::string type{};
    RunStepDetailsToolCallsCodeOutputImageObject_image image;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsToolCallsCodeOutputImageObject_H_ */
