
/*
 * RunStreamEvent.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStreamEvent_H_
#define TINY_CPP_CLIENT_RunStreamEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunObject.h"
#include "RunStreamEvent_oneOf.h"
#include "RunStreamEvent_oneOf_1.h"
#include "RunStreamEvent_oneOf_2.h"
#include "RunStreamEvent_oneOf_3.h"
#include "RunStreamEvent_oneOf_4.h"
#include "RunStreamEvent_oneOf_5.h"
#include "RunStreamEvent_oneOf_6.h"
#include "RunStreamEvent_oneOf_7.h"
#include "RunStreamEvent_oneOf_8.h"
#include "RunStreamEvent_oneOf_9.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStreamEvent{
public:

    /*! \brief Constructor.
	 */
    RunStreamEvent();
    RunStreamEvent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStreamEvent();


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
	RunObject getData();

	/*! \brief Set 
	 */
	void setData(RunObject  data);


    private:
    std::string event{};
    RunObject data;
};
}

#endif /* TINY_CPP_CLIENT_RunStreamEvent_H_ */
