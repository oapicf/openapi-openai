
/*
 * RunStepStreamEvent.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepStreamEvent_H_
#define TINY_CPP_CLIENT_RunStepStreamEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepObject.h"
#include "RunStepStreamEvent_oneOf.h"
#include "RunStepStreamEvent_oneOf_1.h"
#include "RunStepStreamEvent_oneOf_2.h"
#include "RunStepStreamEvent_oneOf_3.h"
#include "RunStepStreamEvent_oneOf_4.h"
#include "RunStepStreamEvent_oneOf_5.h"
#include "RunStepStreamEvent_oneOf_6.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepStreamEvent{
public:

    /*! \brief Constructor.
	 */
    RunStepStreamEvent();
    RunStepStreamEvent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepStreamEvent();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getEvent();

	/*! \brief Set 
	 */
	void setEvent(std::string  event);
	/*! \brief Get 
	 */
	RunStepObject getData();

	/*! \brief Set 
	 */
	void setData(RunStepObject  data);


    private:
    std::string event{};
    RunStepObject data;
};
}

#endif /* TINY_CPP_CLIENT_RunStepStreamEvent_H_ */
