package org.example.plugin

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory
import javax.swing.JPanel
import javax.swing.JLabel
import java.awt.BorderLayout
import javax.swing.ImageIcon

class VideoToolWindowFactory : ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val contentFactory = ContentFactory.getInstance()
        val content = contentFactory.createContent(createToolWindowPanel(), "", false)
        toolWindow.contentManager.addContent(content)
    }

    private fun createToolWindowPanel(): JPanel {
        val panel = JPanel(BorderLayout())
        val videoLabel = JLabel()

        val videoIcon = ImageIcon(javaClass.getResource("/test2.jpg"))
        videoLabel.icon = videoIcon

        panel.add(videoLabel, BorderLayout.CENTER)
        return panel
    }
}