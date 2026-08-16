
/*
 * RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image_H_
#define TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image();
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The [file](/docs/api-reference/files) ID of the image.
	 */
	std::string getFileId();

	/*! \brief Set The [file](/docs/api-reference/files) ID of the image.
	 */
	void setFileId(std::string  file_id);


    private:
    std::string file_id{};
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image_H_ */
