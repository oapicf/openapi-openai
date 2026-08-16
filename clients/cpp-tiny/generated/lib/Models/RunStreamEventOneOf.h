
/*
 * RunStreamEvent_oneOf.h
 *
 * Occurs when a new [run](/docs/api-reference/runs/object) is created.
 */

#ifndef TINY_CPP_CLIENT_RunStreamEvent_oneOf_H_
#define TINY_CPP_CLIENT_RunStreamEvent_oneOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunObject.h"

namespace Tiny {


/*! \brief Occurs when a new [run](/docs/api-reference/runs/object) is created.
 *
 *  \ingroup Models
 *
 */

class RunStreamEvent_oneOf{
public:

    /*! \brief Constructor.
	 */
    RunStreamEvent_oneOf();
    RunStreamEvent_oneOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStreamEvent_oneOf();


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

#endif /* TINY_CPP_CLIENT_RunStreamEvent_oneOf_H_ */
