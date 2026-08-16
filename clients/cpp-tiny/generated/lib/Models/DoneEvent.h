
/*
 * DoneEvent.h
 *
 * Occurs when a stream ends.
 */

#ifndef TINY_CPP_CLIENT_DoneEvent_H_
#define TINY_CPP_CLIENT_DoneEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Occurs when a stream ends.
 *
 *  \ingroup Models
 *
 */

class DoneEvent{
public:

    /*! \brief Constructor.
	 */
    DoneEvent();
    DoneEvent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DoneEvent();


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
	std::string getData();

	/*! \brief Set 
	 */
	void setData(std::string  data);


    private:
    std::string event{};
    std::string data{};
};
}

#endif /* TINY_CPP_CLIENT_DoneEvent_H_ */
