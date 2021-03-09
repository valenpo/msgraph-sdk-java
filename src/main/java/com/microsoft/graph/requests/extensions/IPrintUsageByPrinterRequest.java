// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintUsageByPrinter;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Usage By Printer Request.
 */
public interface IPrintUsageByPrinterRequest extends IHttpRequest {

    /**
     * Gets the PrintUsageByPrinter from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PrintUsageByPrinter> callback);

    /**
     * Gets the PrintUsageByPrinter from the service
     *
     * @return the PrintUsageByPrinter from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageByPrinter get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PrintUsageByPrinter> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrintUsageByPrinter with a source
     *
     * @param sourcePrintUsageByPrinter the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrintUsageByPrinter sourcePrintUsageByPrinter, final ICallback<? super PrintUsageByPrinter> callback);

    /**
     * Patches this PrintUsageByPrinter with a source
     *
     * @param sourcePrintUsageByPrinter the source object with updates
     * @return the updated PrintUsageByPrinter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageByPrinter patch(final PrintUsageByPrinter sourcePrintUsageByPrinter) throws ClientException;

    /**
     * Posts a PrintUsageByPrinter with a new object
     *
     * @param newPrintUsageByPrinter the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrintUsageByPrinter newPrintUsageByPrinter, final ICallback<? super PrintUsageByPrinter> callback);

    /**
     * Posts a PrintUsageByPrinter with a new object
     *
     * @param newPrintUsageByPrinter the new object to create
     * @return the created PrintUsageByPrinter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageByPrinter post(final PrintUsageByPrinter newPrintUsageByPrinter) throws ClientException;

    /**
     * Posts a PrintUsageByPrinter with a new object
     *
     * @param newPrintUsageByPrinter the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PrintUsageByPrinter newPrintUsageByPrinter, final ICallback<? super PrintUsageByPrinter> callback);

    /**
     * Posts a PrintUsageByPrinter with a new object
     *
     * @param newPrintUsageByPrinter the object to create/update
     * @return the created PrintUsageByPrinter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageByPrinter put(final PrintUsageByPrinter newPrintUsageByPrinter) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrintUsageByPrinterRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrintUsageByPrinterRequest expand(final String value);

}
