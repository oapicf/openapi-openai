
/*
 * RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_H_
#define TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject();
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaStepDetailsToolCallsCodeOutputImageObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The index of the output in the outputs array.
	 */
	int getIndex();

	/*! \brief Set The index of the output in the outputs array.
	 */
	void setIndex(int  index);
	/*! \brief Get Always `image`.
	 */
	std::string getType();

	/*! \brief Set Always `image`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image getImage();

	/*! \brief Set 
	 */
	void setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image  image);


    private:
    int index{};
    std::string type{};
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image image;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_H_ */
